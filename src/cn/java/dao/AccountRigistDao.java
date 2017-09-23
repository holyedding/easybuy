package cn.java.dao;

import cn.java.model.Users;

public abstract interface AccountRigistDao
{
  public abstract int isUsernameExists(String paramString)
    throws Exception;
  
  public abstract int isEmailExists(String paramString)
    throws Exception;
  
  public abstract int isTelExists(String paramString)
    throws Exception;
  
  public abstract int rigist(Users paramUsers)
    throws Exception;
  
  public abstract int rigistEmsCode(int paramInt, String paramString)
    throws Exception;
  
  public abstract int isSmsCodeExists(String paramString, int paramInt)
    throws Exception;
  
  public abstract int isSmsCodeExists(String paramString)
    throws Exception;
  
  public abstract int updateEmsCode(int paramInt, String paramString)
    throws Exception;
}


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.dao.AccountRigistDao
 * JD-Core Version:    0.7.0.1
 */