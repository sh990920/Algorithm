import Foundation

func returnDate(_ str: String) -> Array<Int> {
    var result = Array<Int>()
    var strDate = str.components(separatedBy: ".")
    for i in strDate {
        if let num = Int(i) {
            result.append(num)
        }
    }
    return result
}

func compareDate(_ today: Array<Int>, _ dataDate: Array<Int>) -> Bool {
    var result = false
    if today[0] > dataDate[0] {
        result = true
    } else if today[0] == dataDate[0] {
        if today[1] > dataDate[1] {
            result = true
        } else if today[1] == dataDate[1] {
            if today[2] >= dataDate[2] {
                result = true
            }
        }
    }
    return result
}

func solution(_ today:String, _ terms:[String], _ privacies:[String]) -> [Int] {
    var result = Array<Int>()
    // 약관종류
    var dict = Dictionary<String, Int>()
    for i in terms {
        var term = i.components(separatedBy: " ")
        var key = term[0]
        var strValue = term[1]
        if let value = Int(strValue) {
            dict[key] = value
        }
    }
    // 현재 날짜
    var date = returnDate(today)
    
    for (idx, i) in privacies.enumerated() {
        var data = i.components(separatedBy: " ")
        var term = dict[data[1]]
        var dataDate = returnDate(data[0])
        dataDate[1] += term!
        if dataDate[1] > 12 {
            if dataDate[1] % 12 == 0 {
                var count = dataDate[1] / 12
                dataDate[0] += count - 1
                dataDate[1] = 12
            } else {
                var count = dataDate[1] / 12
                dataDate[0] += count
                dataDate[1] %= 12
            }
        }
        
        if compareDate(date, dataDate) {
            result.append(idx + 1)
        }
        
    }
    
    return result
}