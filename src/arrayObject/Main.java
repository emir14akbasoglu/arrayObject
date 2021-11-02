package arrayObject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cars=new ArrayList<Car>();
		ArrayList<CarModel> carModels=new ArrayList<CarModel>();
		
		
		ArrayList<carColor> carColors=new ArrayList<carColor>();
		carColors.add(new carColor("Metalik" , "Siyah"));
		carColors.add(new carColor("Metalik","Mavi"));
		carColors.add(new carColor("Mat","KIRMIZI"));
		carColors.add(new carColor("Mat","SÝyah"));
		carColors.add(new carColor("Parlak","KIRMIZI"));
		carModels.add(new CarModel("Ford","Focus"));
		carModels.add(new CarModel("Renault","Megane"));
		carModels.add(new CarModel("Tofaþ","Þahin"));
		carModels.add(new CarModel("Tofaþ" ,"DoðanSLX"));
		carModels.add(new CarModel("honda" ,"S2000"));
		
		cars.add(new Car("Focus CMax 2018",245000));
		cars.add(new Car("Megan 4",15400));
		cars.add(new Car("þahin",15000));
		cars.add(new Car("DoðanSLX",32500));
		cars.add(new Car("S2000",300000));
		System.out.println(cars.get(0).getCaption());
		System.out.println(cars.get(1).getCaption());
		System.out.println(cars.get(2).getCaption());
        System.out.println(cars.get(3).getCaption());
        System.out.println(cars.get(4).getCaption());
        for(Car car:cars) {
         System.out.println(car.getCaption()+"Fiyat  :"+car.getPrice());
	}
    for(CarModel carModel:carModels) {
    	 System.out.println(carModel.getBrand());
    	
    }
    cars.get(0).setCarModel(carModels.get(0));
    cars.get(1).setCarModel(carModels.get(1));
    cars.get(3).setCarModel(carModels.get(1));
    
    cars.get(2).setCarColor(carColors.get(3));
    System.out.println(cars.get(0).getCaption()+"->"
    		+cars.get(0).getCarModel().getBrand());
   
	}
}
