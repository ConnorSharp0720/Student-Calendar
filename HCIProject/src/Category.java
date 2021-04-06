import java.util.ArrayList;

public class Category
{  
    private String name; 
    
    private Priority priority;
    
    private Tag tag;
    
    private ArrayList<Event> eventList;
    
    
    public Category(String name, Priority priority)
    {
        this.name = name;
        this.priority = priority;
    }

    public Category(String name, Priority priority, String tagName)
    {
        this.name = name;
        this.priority = priority;
        this.tag = new Tag(tagName, Color.BLACK); //TODO: EDIT LATER
    }
    
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }


    /**
     * @return the priority
     */
    public Priority getPriority()
    {
        return priority;
    }


    /**
     * @return the eventList
     */
    public ArrayList<Event> getEventList()
    {
        return eventList;
    }

    /**
     * @return the tag
     */
    public Tag getTag()
    {
        return tag;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }


    /**
     * @param priority the priority to set
     */
    public void setPriority(Priority priority)
    {
        this.priority = priority;
    }
    
    /**
     * @param tag the tag to set
     */
    public void setTag(Tag tag)
    {
        this.tag = tag;
    }
    
    public void addEvent(Event event)
    {
        eventList.add(event);
    }
    
    public void removeEvent(long eventId)
    {
        eventList.remove(eventId);
    }
    
    public String toString() {
    	return "Category Name: " + name + ", Tag: " + tag.getName() + ", Priority: " + priority.toString();
    }
}
