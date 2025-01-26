class Solution {
    public String simplifyPath(String path) 
    {
        String[] folders = path.split("/");
        int n = folders.length;
        Stack<String> pathStack = new Stack<>();
        for(int i=0;i<n;i++)
        {
        //    System.out.print(folders[i]+ " ");
            if(!folders[i].trim().equals(""))
            {
                if(folders[i].equals(".."))
                {
                    if(pathStack.isEmpty()==false) pathStack.pop();
                    else continue;
                } 
                else if(folders[i].equals(".")) continue;
                else pathStack.push(folders[i]);
            }
        }
       // System.out.println(pathStack);
        int s = pathStack.size();
        String[] res = new String[s];
        s--;
        while(!pathStack.isEmpty())
        {
            res[s] = pathStack.pop();
            s--;
        }

        String canonicalPath = "";
        for(int i=0;i<res.length;i++)
        {
           canonicalPath+="/"+res[i];
          // System.out.print(res[i]+ " ");
        }
        return canonicalPath.equals("")?"/":canonicalPath;    
    }
}