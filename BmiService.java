public class BmiService {
    public double calculate (int weight, int height){
        // умножаем на 10000, так как рост вводится в сантиметрах, вместо метров
        double index = weight*10000/(height*height);
        return index;
    }
}
