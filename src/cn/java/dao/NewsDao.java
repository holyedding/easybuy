package cn.java.dao;

import java.util.List;
import java.util.Map;

public abstract interface NewsDao
{
  public abstract List<Map<String, Object>> news()
    throws Exception;
}


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.dao.NewsDao
 * JD-Core Version:    0.7.0.1
 */