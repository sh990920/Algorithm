import Foundation

func solution(_ a:Int, _ b:Int) -> String {
    var result = ""
    let dateString = "2016-\(a)-\(b)"
    let dateFormatter = DateFormatter()
    dateFormatter.dateFormat = "yyyy-MM-dd"
    guard let date = dateFormatter.date(from: dateString) else {
        return result
    }
    let calendar = Calendar.current
    let weekDay = calendar.component(.weekday, from: date)
    
    switch weekDay {
    case 1:
        result = "SUN"
    case 2:
        result = "MON"
    case 3:
        result = "TUE"
    case 4:
        result = "WED"
    case 5:
        result = "THU"
    case 6:
        result = "FRI"
    case 7:
        result = "SAT"
    default: 
        result = "no"
    }
    return result
}