
/**
 * Write a description of class ASeries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.ArrayList;

public class ASeries
{

   

    public int[] longest(int[] values)
    {
        int highestDiff = 0;
        int seriesCount;
        int[] sortedValues = values;
        int[] sortedArray = new int[0];
        ArrayList<Integer> seriesList = new ArrayList<Integer>();
        

        Arrays.sort(sortedValues);

        for(int cntValues = 1; cntValues < sortedValues.length; cntValues++){
            int newDiff = sortedValues[cntValues] - sortedValues[cntValues - 1];
            if(newDiff > highestDiff){
                highestDiff = newDiff;
            }
        }

        for(int i = 1; i <= highestDiff; i++){
            seriesCount = 0;
            for(int j = 0; j < sortedValues.length - 1; j++){
                int currNumber = sortedValues[j];

                while(currNumber < sortedValues[sortedValues.length]){
                    
                }
            }
        }   

        return values;
    }
}
