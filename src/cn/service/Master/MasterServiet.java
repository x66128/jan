package cn.service.Master;

import cn.pojo.Master;

public interface MasterServiet {
	Master getMaster(String name,String password);
	boolean addMaster(Master master);
}
