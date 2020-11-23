class Solution {
public int[] processQueries(int[] queries, int m) {
int ans[] =new int[queries.length];
List list=new ArrayList();
for(int i=0;i<m;i++){
list.add(i+1);
}
for(int j=0;j<queries.length;j++){
for(int k=0;k<m;k++){
if(queries[j]==(int)list.get(k)){
ans[j]=k;
int temp=(int)list.remove(k);
list.add(0,temp);
break;
}
}
}
return ans;
}
}