import Foundation
let n = Int(readLine()!)!

var result = 0

for i in 1 ... n {
    result += n - 1
}

print(result)