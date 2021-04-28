
public class Data {
	
	private String SIGUN_NM;			//시군명
	private String CMPNM_NM;			//상호명
	private String INDUTYPE_NM;			//업종명
	private String REFINE_ROADNM_ADDR;	//도로명주소
	private String TELNO;				//전화번호
	private String DATA_STD_DE;			//데이터 기준 일자
	private String REFINE_WGS84_LAT;	//경도
	private String REFINE_WGS84_LOGT;	//위도
	
	//해당 값들을 받는 생성자를 추가
	public Data(String SIGUN_NM, String CMPNM_NM, String INDUTYPE_NM, String REFINE_ROADNM_ADDR, String TELNO, String DATA_STD_DE, String REFINE_WGS84_LAT, String REFINE_WGS84_LOGT) {
		this.SIGUN_NM=SIGUN_NM;
		this.CMPNM_NM=CMPNM_NM;
		this.TELNO=TELNO;
		this.REFINE_ROADNM_ADDR=REFINE_ROADNM_ADDR;
		this.INDUTYPE_NM=INDUTYPE_NM;
		this.DATA_STD_DE=DATA_STD_DE;
		this.REFINE_WGS84_LAT=REFINE_WGS84_LAT;
		this.REFINE_WGS84_LOGT=REFINE_WGS84_LOGT;
	}
	
	public String getCMPNM_NM() {
		return CMPNM_NM;
	}
	
	public String getTELNO() {
		return TELNO;
	}
	
	public String getREFINE_ROADNM_ADDR() {
		return REFINE_ROADNM_ADDR;
	}
	
	public String getINDUTYPE_NM() {
		return INDUTYPE_NM;
	}
	
	public String getSIGUN_NM() {
		return SIGUN_NM;
	}
	
	public String getDATA_STD_DE() {
		return DATA_STD_DE;
	}
	
	public String getREFINE_WGS84_LAT() {
		return REFINE_WGS84_LAT;
	}
	
	public String getREFINE_WGS84_LOGT() {
		return REFINE_WGS84_LOGT;
	}
}
