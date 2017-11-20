public class Hashtable {
	private String [] table = new String[3033];
	
	public boolean containsKey(String key){
		if(table[myhash(key)] != null){
			return true;
		}
		return false;
	}
	
	public String get(String key){
		return table[myhash(key)];
	}
	
	public void put(String key, String value){
		if(table[myhash(key)] == null){
			table[myhash(key)]= value;
		}
			int pos = (myhash(key)+1)%table.length;
			while(table[pos]!= null){
				pos = (pos +1)%table.length;
			}
			table[pos] = value;
		}
		
	
	public String remove(String key){
		String temp =table[myhash(key)];
		table[myhash(key)] = null;
		return temp;
		}
	
	private int myhash(String key){
		int hashVal = key.hashCode();
		hashVal = hashVal % table.length;
		if(hashVal< 0){
			hashVal += table.length;
		}
		return hashVal;
	}
}
