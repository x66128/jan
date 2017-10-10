package cn.service.Master;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.master.MasterMapeer;
import cn.pojo.Master;

@Service
public class MasterServietImpl implements MasterServiet {
	@Resource
	private MasterMapeer mapeer;

	@Override
	public Master getMaster(String name, String password) {
		Master master = null;
		master = mapeer.getMaster(name);
		if (master != null) {
			if (!master.getPassword().equals(password)) {
				master = null;
			}
		}
		return master;
	}

	@Override
	public boolean addMaster(Master master) {
		return mapeer.addMaster(master) > 0;
	}
}
