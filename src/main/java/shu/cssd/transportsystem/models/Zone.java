package shu.cssd.transportsystem.models;

import shu.cssd.transportsystem.foundation.BaseModel;
import shu.cssd.transportsystem.models.collections.SetOfZones;

import java.util.ArrayList;

public class Zone extends BaseModel
{
    /**
     * Name of the Zone
     */
    public String name;


    /**
     * Create a new Zone in the system
     * @param name
     */
    public Zone(String name)
    {
        this.name = name;
    }

    /**
     * Get the Stops of a Zone
     *
     * @return {@link ArrayList<Stop>}
     */
    public ArrayList<Stop> getStops()
    {
        ArrayList<Stop> stops = new ArrayList<Stop>();

        SetOfZones setOfZones = new SetOfZones();

        ArrayList<BaseModel> rows = setOfZones.all();

        for (BaseModel row: rows)
        {
            Stop stop = (Stop) row;

            if (stop.zoneId.equals(this.id))
            {
                stops.add(stop);
            }
        }
        return stops;
    }
}
