package com.rubikme.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rubikme.common.entity.Setting;
import com.rubikme.common.entity.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
