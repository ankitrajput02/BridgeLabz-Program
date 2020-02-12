package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import model.Appointment;
import model.DoctorDetails;
import model.PatientDetails;

/**
 * @author admin1
 *
 */
public class Controller {
	/**
	 * 
	 */
	ObjectMapper objectMapper=new ObjectMapper();

	File doctors=new File("/home/admin1/workspace-pro/Hospital/src/doctor.json");
	File patients=new File("/home/admin1/workspace-pro/Hospital/src/patient.json");
	File appointments=new File("/home/admin1/workspace-pro/Hospital/src/appointment.json");
	/**
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public List<DoctorDetails> readFileDoctor() throws JsonParseException, JsonMappingException, IOException{
		List<DoctorDetails> list=objectMapper.readValue(doctors, new TypeReference <List<DoctorDetails>>() {
		});
		return list;
	}
	/**
	 * @param docList
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@SuppressWarnings("deprecation")
	public List<DoctorDetails> writeFileDoctor(List<DoctorDetails> docList) throws JsonGenerationException, JsonMappingException, IOException{
		objectMapper.defaultPrettyPrintingWriter().writeValue(doctors, docList);
		return docList;
	}
	/**
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public List<PatientDetails> readFilePatient() throws JsonParseException, JsonMappingException, IOException{
		List<PatientDetails> list=objectMapper.readValue(patients, new TypeReference<List<PatientDetails>>() {
		});
		return list;
	}
	/**
	 * @param patList
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@SuppressWarnings("deprecation")
	public List<PatientDetails> writeFilePatient(List<PatientDetails> patList) throws JsonGenerationException, JsonMappingException, IOException{
		objectMapper.defaultPrettyPrintingWriter().writeValue(patients, patList);
		return patList;

	}
	/**
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public List<Appointment> readFileAppo() throws JsonParseException, JsonMappingException, IOException{
		List<Appointment> list=objectMapper.readValue(appointments,new TypeReference<List<Appointment>>() {}); 
		return list;
	}
	/**
	 * @param appList
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@SuppressWarnings("deprecation")
	public List<Appointment> writeFileAppo(List<Appointment> appList) throws JsonGenerationException, JsonMappingException, IOException{
		objectMapper.defaultPrettyPrintingWriter().writeValue(appointments, appList);
		return appList;

	}

}
