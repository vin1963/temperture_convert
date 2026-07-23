# C# 一週學習計畫 - 快速參考指南

## 📚 課程總覽

### Day 1-2: 基礎語法
- **01_VariablesAndDataTypes.cs** - 變數與資料型別
  - int, double, string, bool, var
  - 型別轉換
  - 常數

- **02_Operators.cs** - 運算子
  - 算術運算子 (+, -, *, /, %)
  - 比較運算子 (==, !=, <, >)
  - 邏輯運算子 (&&, ||, !)
  - 賦值運算子 (+=, -=, *=)

- **03_ControlFlow.cs** - 流程控制
  - if-else 條件判斷
  - switch 多重選擇
  - 巢狀條件

- **04_Loops.cs** - 迴圈
  - for 迴圈
  - while / do-while
  - foreach 迴圈
  - break / continue

- **05_ArraysAndCollections.cs** - 陣列與集合
  - 一維陣列、二維陣列
  - List<T>
  - Dictionary<TKey, TValue>
  - LINQ 基礎查詢

- **Practice_Calculator.cs** - 練習：簡易計算機
- **Practice_GradeSystem.cs** - 練習：成績評等系統

### Day 3-4: 物件導向程式設計
- **01_ClassesAndObjects.cs** - 類別與物件
  - 類別定義
  - 建構子
  - 屬性與方法
  - 靜態成員

- **02_Encapsulation.cs** - 封裝
  - 存取修飾詞 (public, private)
  - 屬性 (Properties)
  - 方法封裝

- **03_Inheritance.cs** - 繼承
  - 基底類別與衍生類別
  - base 關鍵字
  - override 覆寫
  - virtual 虛擬方法

- **04_Polymorphism.cs** - 多型
  - 抽象類別 (abstract)
  - 多型應用
  - 方法多載

- **05_Interfaces.cs** - 介面
  - 介面定義
  - 介面實作
  - 多重介面

- **Practice_BankSystem.cs** - 練習：銀行帳戶管理系統

### Day 5-6: 進階概念
- **01_ExceptionHandling.cs** - 例外處理
  - try-catch-finally
  - 多重 catch
  - 拋出例外 (throw)
  - 自訂例外
  - using 語句

- **02_LINQ.cs** - LINQ 查詢
  - Where (篩選)
  - Select (投影)
  - OrderBy (排序)
  - GroupBy (分組)
  - Count, Sum, Average, Max, Min

- **03_Lambda.cs** - Lambda 表達式
  - Lambda 語法
  - Func<T> 和 Action<T>
  - Lambda 與 LINQ
  - 閉包

- **04_Generics.cs** - 泛型
  - 泛型方法
  - 泛型類別
  - 泛型約束 (where)
  - 泛型集合

- **05_FileIO.cs** - 檔案讀寫
  - File.ReadAllText / WriteAllText
  - StreamReader / StreamWriter
  - CSV 檔案處理
  - 檔案與目錄操作

### Day 7: 綜合實戰
- **StudentManagementSystem.cs** - 學生管理系統
  - 完整 CRUD 功能
  - 資料持久化
  - LINQ 查詢應用
  - 統計與排名

## 🎯 學習路徑建議

### Week 1: 基礎打底
```
Day 1: 變數、運算子、流程控制
Day 2: 迴圈、陣列、練習題
```

### Week 1: 物件導向
```
Day 3: 類別、封裝、繼承
Day 4: 多型、介面、練習題
```

### Week 1: 進階技巧
```
Day 5: 例外處理、LINQ、Lambda
Day 6: 泛型、檔案處理
```

### Week 1: 實戰演練
```
Day 7: 學生管理系統專案
```

## 📖 快速語法參考

### 變數宣告
```csharp
int age = 25;
string name = "John";
var score = 95.5;  // 自動推斷為 double
```

### 條件判斷
```csharp
if (score >= 60)
    Console.WriteLine("及格");
else
    Console.WriteLine("不及格");
```

### 迴圈
```csharp
for (int i = 0; i < 10; i++)
    Console.WriteLine(i);

foreach (var item in list)
    Console.WriteLine(item);
```

### 類別定義
```csharp
class Person
{
    public string Name { get; set; }
    public int Age { get; set; }
    
    public void Greet()
    {
        Console.WriteLine($"Hello, {Name}");
    }
}
```

### LINQ 查詢
```csharp
var adults = people.Where(p => p.Age >= 18);
var sorted = people.OrderBy(p => p.Name);
var average = people.Average(p => p.Age);
```

### Lambda 表達式
```csharp
Func<int, int> square = x => x * x;
list.ForEach(item => Console.WriteLine(item));
```

### 例外處理
```csharp
try
{
    // 可能發生錯誤的程式碼
}
catch (Exception ex)
{
    Console.WriteLine(ex.Message);
}
finally
{
    // 清理資源
}
```

## 🔍 常用 LINQ 方法

| 方法 | 說明 | 範例 |
|------|------|------|
| Where | 篩選 | `list.Where(x => x > 5)` |
| Select | 投影 | `list.Select(x => x * 2)` |
| OrderBy | 排序 | `list.OrderBy(x => x)` |
| First | 第一個 | `list.First()` |
| Count | 計數 | `list.Count()` |
| Sum | 總和 | `list.Sum()` |
| Average | 平均 | `list.Average()` |
| Max/Min | 最大/最小 | `list.Max()` |
| GroupBy | 分組 | `list.GroupBy(x => x.Category)` |
| Any | 是否存在 | `list.Any(x => x > 10)` |
| All | 是否全部 | `list.All(x => x > 0)` |

## 💡 重要觀念

### 1. 命名規範
- 類別、方法：PascalCase (`StudentManager`)
- 變數、參數：camelCase (`studentName`)
- 常數：全大寫 (`MAX_VALUE`)

### 2. 存取修飾詞
- `public` - 公開，任何地方可存取
- `private` - 私有，只有類別內部可存取
- `protected` - 保護，類別及子類別可存取

### 3. OOP 四大支柱
- **封裝 (Encapsulation)** - 隱藏內部實作
- **繼承 (Inheritance)** - 程式碼重用
- **多型 (Polymorphism)** - 一個介面，多種實作
- **抽象 (Abstraction)** - 只定義介面，不實作細節

### 4. 集合選擇
- `List<T>` - 動態陣列
- `Dictionary<K,V>` - 鍵值對
- `HashSet<T>` - 不重複集合
- `Queue<T>` - 先進先出
- `Stack<T>` - 後進先出

## 🚀 下一步學習

1. **ASP.NET Core** - Web 開發
2. **Entity Framework** - ORM 資料庫存取
3. **WPF/MAUI** - 桌面與行動應用
4. **設計模式** - 軟體架構
5. **async/await** - 非同步程式設計
6. **單元測試** - xUnit, NUnit
7. **依賴注入** - DI Container

## 📌 常見錯誤提醒

❌ 忘記加分號
```csharp
int x = 5  // 錯誤
int x = 5; // 正確
```

❌ 大小寫錯誤
```csharp
console.writeline(); // 錯誤
Console.WriteLine(); // 正確
```

❌ 除以零
```csharp
int result = 10 / 0; // 錯誤，會拋出例外
```

❌ 空參考
```csharp
string name = null;
int len = name.Length; // 錯誤，NullReferenceException
```

## ✅ 學習檢查表

- [ ] 能夠宣告並使用不同的資料型別
- [ ] 理解並應用條件判斷與迴圈
- [ ] 能夠操作陣列和集合
- [ ] 理解類別、物件、方法的概念
- [ ] 掌握封裝、繼承、多型
- [ ] 能夠定義和實作介面
- [ ] 會使用 LINQ 查詢資料
- [ ] 理解 Lambda 表達式
- [ ] 能夠處理例外
- [ ] 會進行檔案讀寫
- [ ] 能夠獨立完成小型專案

恭喜你完成 C# 一週學習計畫！🎉
