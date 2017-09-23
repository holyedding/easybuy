package cn.java.service;

import cn.java.model.Users;

public abstract interface AccountRigistService
{
  public abstract boolean isUsernameExists(String paramString)
    throws Exception;
  
  public abstract boolean isEmailExists(String paramString)
    throws Exception;
  
  public abstract boolean isTelExists(String paramString)
    throws Exception;
  
  public abstract boolean rigist(Users paramUsers)
    throws Exception;
  
  public abstract int rigistEmsCode(int paramInt, String paramString)
    throws Exception;
  
  public abstract boolean isSmsCodeExists(String paramString, int paramInt)
    throws Exception;
  
  public abstract boolean isSmsCodeExists(String paramString)
    throws Exception;
  
  public abstract int updateEmsCode(int paramInt, String paramString)
    throws Exception;
}


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.AccountRigistService
 * JD-Core Version:    0.7.0.1
 */