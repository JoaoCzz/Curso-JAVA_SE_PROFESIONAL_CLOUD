package principal;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

public 	Integer first(){
	if(size()==0) {
		return null;
	}
	return this.get(0);
}

public Integer last() {
	int todos= size();
	 if (todos > 0) {
		 return this.get(todos - 1);
	 }
	 return null;
}

public int sum() {
	int suma=0;
	for(Integer num:this) {
		suma+=num;
	}
	return suma;
}

@Override
public boolean add(Integer num){
	if(!this.contains(num)) {
		return super.add(num);
	}
	return false;
}

}

