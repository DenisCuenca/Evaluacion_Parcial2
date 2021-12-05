
              // f(x) = Math.pow(10, 2) -10
              // f'(x) = 2x

def mnr(x: Double, t:Int) : Double ={
  
  var r = x - ((Math.pow(x, 2) - 10 ) /  (2*x))
  t match {
    case 3=> r
    
    case _ => mnr(r, t+1)
        
  }
  
}

mnr(3, 0)

