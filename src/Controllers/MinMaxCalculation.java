public class MinMaxCalculation {
    private ArrayList<Double> data;
    public MinMaxCalculation(ArrayList<Double> data) {
        this.data = data;
    }

    public ArrayList<Double> getData() {
        return this.data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }

    public double minCalc(){
        double min = getData().get(0);
        for(double num : data){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public double maxCalc(){
        double max = getData().get(0);
        for(double num : data){
            if(num > max){
                max = num;
            }
        }
        return max;
    }    
}