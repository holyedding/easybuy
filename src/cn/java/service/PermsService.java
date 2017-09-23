package cn.java.service;

import java.util.List;
import java.util.Map;

public abstract interface PermsService
{
  public abstract int selectUsersPerms(String paramString)
    throws Exception;
  
  public abstract int selectAdminsPerms(String paramString)
    throws Exception;
  
  public abstract int selectUrlsPerms(String paramString)
    throws Exception;
  
  public abstract List<Map<String, Object>> selectUrls()
    throws Exception;
}


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.PermsService
 * JD-Core Version:    0.7.0.1
 */