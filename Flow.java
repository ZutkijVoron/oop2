import java.util.Iterator;
import java.util.List;

/**
 * Flow
 */
public class Flow implements Iterable<StudentGroup> {
	private List<StudentGroup> studentGroupList;

	public Flow(List<StudentGroup> studentGroupList) {
		this.studentGroupList = studentGroupList;
	}

	public List<StudentGroup> getStudentGroupList() {
		return studentGroupList;
	}

	public void setStudentGroupList(List<StudentGroup> studentGroupList) {
		this.studentGroupList = studentGroupList;
	}

	public void addStudentGroup(StudentGroup studentGroup) {
		studentGroupList.add(studentGroup);
	}

	@Override
	public Iterator<StudentGroup> iterator() {
		return new FlowIterator(this);
	}

}
