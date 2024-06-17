import Foundation

func solution(_ elements:[Int]) -> Int {
    var sumSet = Set<Int>()
    var count = elements.count
    
    for i in 1...count {
        if i == 1 {
            for j in elements {
                sumSet.insert(j)
            }
        } else if i == count {
            var sum = 0
            for j in elements {
                sum += j
            }
            sumSet.insert(sum)
        } else {
            for j in 0..<count {
                var sum = 0
                for k in 0..<i {
                    sum += elements[(j + k) % count]
                }
                sumSet.insert(sum)
            }
        }
    }
    
    
    return sumSet.count
}