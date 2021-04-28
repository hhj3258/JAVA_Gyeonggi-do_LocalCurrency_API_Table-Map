import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
//AbstractTableModel 을 커스터마이징 하기 위해 상속 받는다.
public class DataTableModel extends AbstractTableModel {
	
	//데이터를 여러개 관리할 arraylist 를 선언
	//이 arraylist 는 이전에 만든 Data 클래스를 템플릿으로 사용한다.
	private ArrayList<Data> dataList = new ArrayList<Data>();
	
	//상속받은 기본 함수로, 컬럼 갯수를 지정한다.
	//현재 컬럼은 6종류
	@Override
	public int getColumnCount() { return 6; }
	
	//상속받은 기본 함수로, 데이터 개수를 지정한다.
	//데이터 개수로 개수를 설정해준다.
	@Override
	public int getRowCount() { return dataList.size(); }

	//각 행렬에 어떤 데이터를 보여줄 것인지 설정한다.
	@Override
	public Object getValueAt(int row, int col) {
		Data d=dataList.get(row);
		
		//col 의 경우 각 컬럼의 데이터를 불러와야 한다.
		if(col == 0)
			return d.getSIGUN_NM();	
		else if(col == 1)	
			return d.getCMPNM_NM(); 
		else if(col == 2)
			return d.getINDUTYPE_NM(); 
		else if(col == 3)
			return d.getREFINE_ROADNM_ADDR();	
		else if(col == 4)
			return d.getTELNO();	
		else
			return d.getDATA_STD_DE();
	}
	
	//컬럼 이름을 설정
	private final String columns[] = {"시군명", "상호명", "업종명", "도로명주소", "우편번호", "데이터 기준일자"};
	@Override
	public String getColumnName(int col) { return columns[col]; }
	
	//유저 함수로 데이터를 넣을 수 있는 함수 및 초기화 함수 추가
	public void addData(Data data) {
		//리스트에 값을 넣어줌
		dataList.add(data);
		
		//ui 에 데이터가 추가되었음을 알림
		fireTableDataChanged();
	}
	
	public void clearData() {
		//리스트 비우기
		dataList.clear();
		
		//ui에 데이터가 변경되었음을 알림.
		fireTableDataChanged();
	}
	
}
