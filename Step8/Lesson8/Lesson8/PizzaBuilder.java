package Lesson8;

class Pizza{
    //ピザの必須項目
    private String size;   // サイズ: Small, Medium, Large
    private String crust;  // 生地の種類: Thin Crust, Thick Crust

    //オプション
    private boolean cheese;    
    private boolean pepperoni;
    private boolean olives;

    //プライベートコンストラクタ（外から直接作れない）
    private Pizza(PizzaBuilder builder){
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.olives = builder.olives;
    }

    //ピザの情報をわかりやすく表示するためのメソッド
    @Override
    public String toString(){
        return "Pizza [サイズ=" + size 
            + ", 生地=" + crust 
            + ", チーズ=" + cheese 
            + ", ペパロニ=" + pepperoni 
            + ", オリーブ=" + olives + "]";
    }

    //ビルダークラス（ピザを作るための設計図）
    public static class PizzaBuilder{
        //必須項目
        private String size;
        private String crust;

        //オプション（デフォルトはfalse）
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean olives = false;

        //コンストラクタで必須項目をセット（必ず指定する）
        public PizzaBuilder(String size, String crust){
            this.size = size;
            this.crust = crust;
        }

        //オプションの設定メソッド（設定したいものだけ呼び出す）
        public PizzaBuilder addCheese(){
            this.cheese = true;
            return this;  // メソッドチェーンを可能にする
        }

        public PizzaBuilder addPepperoni(){
            this.pepperoni = true;
            return this;
        }

        public PizzaBuilder addOlives(){
            this.olives = true;
            return this;
        }

        // 最終的にピザを作る（buildメソッド）
        public Pizza build(){
            return new Pizza(this);
        }
    }
}