import java.util.ArrayList;
public class StepTracker
{
private int days; 
private int totalSteps;
private int activeDays;
private int minActiveSteps;
public StepTracker(int minStepsActive){
days = 0;
totalSteps = 0;
activeDays = 0;
 this.minActiveSteps = minStepsActive;
}
public void addDailySteps(int steps){
totalSteps += steps;
days++;
if (steps >= minActiveSteps) {
 activeDays++;
}
}
public int activeDays(){
return activeDays;
}
 public double averageSteps(){
if(days == 0)
return 0.0;
return (double) totalSteps / days;
    }
}
