import java.util.ArrayList;

public class Event
{
    private static long eventCount = 0;
    
    private String name; 
    
    private String description;
    
    private Tag tag;
    
    private long startTime;
    
    private long endTime;
    
    private long timeSpan;
    
    private long eventId;
    
    private ArrayList<TimeObject> datesAndTimes;
    
    
    /***
     * Whether or not the event is recurring
     */
    private boolean isRecurring;
    
    /***
     * The interval in seconds between each event
     */
    private long recurrenceInterval;
    
    // private LatLong location;
    
    private Priority priority;
    
    
    public Event(String name, String description, long startTime, long endTime, String location, Priority priority)
    {
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.eventId = 1000 + eventCount;
        eventCount ++;
        //this.location = location;
        this.priority = priority;
        //tag = Tag.DEFAULT;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return the startTime
     */
    public long getStartTime()
    {
        return startTime;
    }

    /**
     * @return the endTime
     */
    public long getEndTime()
    {
        return endTime;
    }

    /**
     * @return the timeSpan
     */
    public long getTimeSpan()
    {
        return timeSpan;
    }

    /**
     * @return the eventID
     */
    public long getEventId()
    {
        return eventId;
    }
    
    /**
     * @return the priority
     */
    public Priority getPriority()
    {
        return priority;
    }
    
    /**
     * @return the tag
     */
    public Tag getTag()
    {
        return tag;
    }
    
    public long getRecurrenceInterval()    
    {
    	return recurrenceInterval;
    }
    
    /**
     * @return the possible dates and times list
     */
    public ArrayList<TimeObject> getDatesAndTimes()
    {
        return datesAndTimes;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(long startTime)
    {
        this.startTime = startTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(long endTime)
    {
        this.endTime = endTime;
    }

    /**
     * @param timeSpan the timeSpan to set
     */
    public void setTimeSpan(long timeSpan)
    {
        this.timeSpan = timeSpan;
    }

    /**
     * @param eventID the eventID to set
     */
    public void setEventID(long eventId)
    {
        this.eventId = eventId;
    }
    
    /**
     * @param priority the Priority to set
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
    
    public void setRecurrenceInterval(long recurrenceInterval)
    {
    	this.recurrenceInterval = recurrenceInterval;
    }

    
}
