public class BmiService {
    public Integer calculate (int weight, int height){
        // умножаем на 10000, так как рост вводится в сантиметрах, вместо метров
        int index = weight*10000/(height*height);
        return index;
    }
}
