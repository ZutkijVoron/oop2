import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<StudentGroup> {
	private List<StudentGroup> flow;
	private int counter;

	public FlowIterator(Flow flow) {
		this.flow = flow.getStudentGroupList();
		counter = 0;
	}

	@Override
	public boolean hasNext() {
		return counter < flow.size();
	}

	@Override
	public StudentGroup next() {
		if (hasNext()) {
			return flow.get(counter++);
		}
		return null;
	}

	@Override
	public void remove() {
		if (hasNext())
			flow.remove(counter);
	}

}
