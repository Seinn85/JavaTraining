//インターフェース
interface DrinkFactory{
    
    //コーヒーを作るメソッド
    Coffee createCoffee();

    //お茶を作るメソッド
    Tea createTea();
}