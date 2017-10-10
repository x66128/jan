package cn.dao.master;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Master;

public interface MasterMapeer {
		Master getMaster(@Param("name") String name);
		int addMaster(Master master);
}
