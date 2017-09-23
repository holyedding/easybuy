package cn.java.service;

import java.util.List;
import java.util.Map;

public abstract interface NewsService
{
  public abstract List<Map<String, Object>> news()
    throws Exception;
}


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.NewsService
 * JD-Core Version:    0.7.0.1
 */