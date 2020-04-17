package searchclient;


/**
 * The Class BoardObject.
 */
public class BoardObject {

    // Attributes:
    private String id; 
    private String color;



    /**
	 * Instantiate a new BoardObject.
	 * 
	 * @param id the id
	 * @param color the color
	 */
    public BoardObject(String id, String color) {
		this.id = id;
		this.color = color;
	}
    
    /**
	 * Gets the id.
	 * 
	 * @return the id
	 * @returns the id of the object
	 */
	public String getColor() {
		return color;
    }


    /**
	 * Gets the color.
	 * 
	 * @return the color
	 * @returns the color of the object
	 */
	public String getId() {
		return id;
    }
    

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		return result;
	}

}