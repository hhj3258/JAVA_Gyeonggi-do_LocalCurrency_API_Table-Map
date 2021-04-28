import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
//AbstractTableModel �� Ŀ���͸���¡ �ϱ� ���� ��� �޴´�.
public class DataTableModel extends AbstractTableModel {
	
	//�����͸� ������ ������ arraylist �� ����
	//�� arraylist �� ������ ���� Data Ŭ������ ���ø����� ����Ѵ�.
	private ArrayList<Data> dataList = new ArrayList<Data>();
	
	//��ӹ��� �⺻ �Լ���, �÷� ������ �����Ѵ�.
	//���� �÷��� 6����
	@Override
	public int getColumnCount() { return 6; }
	
	//��ӹ��� �⺻ �Լ���, ������ ������ �����Ѵ�.
	//������ ������ ������ �������ش�.
	@Override
	public int getRowCount() { return dataList.size(); }

	//�� ��Ŀ� � �����͸� ������ ������ �����Ѵ�.
	@Override
	public Object getValueAt(int row, int col) {
		Data d=dataList.get(row);
		
		//col �� ��� �� �÷��� �����͸� �ҷ��;� �Ѵ�.
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
	
	//�÷� �̸��� ����
	private final String columns[] = {"�ñ���", "��ȣ��", "������", "���θ��ּ�", "�����ȣ", "������ ��������"};
	@Override
	public String getColumnName(int col) { return columns[col]; }
	
	//���� �Լ��� �����͸� ���� �� �ִ� �Լ� �� �ʱ�ȭ �Լ� �߰�
	public void addData(Data data) {
		//����Ʈ�� ���� �־���
		dataList.add(data);
		
		//ui �� �����Ͱ� �߰��Ǿ����� �˸�
		fireTableDataChanged();
	}
	
	public void clearData() {
		//����Ʈ ����
		dataList.clear();
		
		//ui�� �����Ͱ� ����Ǿ����� �˸�.
		fireTableDataChanged();
	}
	
}
