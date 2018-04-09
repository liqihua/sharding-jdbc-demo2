package com.liqihua.dao.source2.interf;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SysProvinceDao {

    public List<Map<String,Object>> findListSQL(@Param("sql") String sql);

    public void exec(@Param("sql") String sql);


}
