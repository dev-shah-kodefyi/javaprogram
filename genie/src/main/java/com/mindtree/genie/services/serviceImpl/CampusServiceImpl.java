package com.mindtree.genie.services.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.sql.rowset.serial.SerialException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.mindtree.genie.Dto.CampusDto;
import com.mindtree.genie.Dto.GenieDto;
import com.mindtree.genie.entity.Campus;
import com.mindtree.genie.entity.Genie;
import com.mindtree.genie.exception.NoSuchCampusMind;
import com.mindtree.genie.exception.ServiceException;
import com.mindtree.genie.repositary.CampusRepositary;
import com.mindtree.genie.repositary.GenieRepositary;
import com.mindtree.genie.services.CampusService;

@Service
public class CampusServiceImpl implements CampusService {

	@Autowired
	CampusRepositary campusRepositary;

	@Autowired
	GenieRepositary genieRepositary;

	private ModelMapper modelMapper = new ModelMapper();

	@Bean
	public ModelMapper Mapper() {
		return new ModelMapper();
	}

	public String insertCampusMind(Campus campusmind) {
		// TODO Auto-generated method stub
		Campus message = campusRepositary.save(campusmind);

		return "campus_mind_inserted";

	}

	@Override
	public CampusDto insert(CampusDto campus) {

		Campus campusentity = new Campus();
		Genie genieentity = new Genie();
		Set<Campus> campuslist = new HashSet<>();
		Set<Genie> genielist = new HashSet<>();

		campusentity.setMid(campus.getMid());
		campusentity.setName(campus.getName());
		campusentity.setProject(campus.getProject());
		campuslist.add(campusentity);

		if (campus.getGenielist() != null) {

			campus.getGenielist().forEach(g -> {
				genieentity.setGenieStatus(g.isGenieStatus());
				genieentity.setGenieDescription(g.getGenieDescription());
				genielist.add(genieentity);

			});
		}
		genieentity.setCampus(campusentity);
		campusentity.setGenielist(genielist);
		campusRepositary.save(campusentity);

		return modelMapper.map(campusentity, CampusDto.class);

	}

	@Override
	public Set<Genie> getGeniee(int mid) throws ServiceException {

		if (campusRepositary.existsById(mid)) {

			Campus camp = campusRepositary.findByMid(mid);

			Set<Genie> genielist = camp.getGenielist();

			return genielist;
		} else {
			try {
				throw new NoSuchCampusMind("No Such Campus Mind");
			} catch (NoSuchCampusMind e) {
				throw new ServiceException(e.getMessage());
			}
		}

	}

	@Override
	public String insertgenie(Set<Genie> list, int mid) {
		Campus campus = campusRepositary.findByMid(mid);

		campus.getGenielist().addAll(list);

		campusRepositary.save(campus);
		return "assigned";

	}

//	@Override
//	public Genie assign(int mid) {
//		Campus camp=campusRepositary.findByMid(mid);
//		Genie genieobj=new Genie();
//		genieobj.setCampus(camp);
//		genieRepositary.save(genieobj);
//		return genieobj;
//	}

	@Override
	public Genie assign(int mid, int genieId) {
		Campus camp = campusRepositary.findByMid(mid);
		Genie genie = genieRepositary.findById(genieId).get();

		genie.setCampus(camp);
		genieRepositary.save(genie);
		return genie;

	}
}