package Command;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
	private String training;
	private List<Viewer> viewers = new ArrayList<Viewer>();

	
	
	public void setTraining(String training)
	{
		this.training = training;
		for(Viewer viewer: this.viewers) {
			viewer.setTraining(this.training);
		}		
	}
	public void subscribe(Viewer viewer) {
		this.viewers.add(viewer);		
	}
}
