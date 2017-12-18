function menseki(r, p=3.14){
    return r*r*p;
}
document.write("問題１<br>")
document.write(menseki(5)+"cm2<br>");
document.write(menseki(7)+"cm2<br>");
document.write(menseki(10)+"cm2<br>");

function ryoukin(A,C,adult=500,child=200){
    return A*adult+C*child;
}
document.write("問題２<br>")
document.write(ryoukin(2,4)+"円です。<br>");
document.write(ryoukin(1,5)+"円です。<br>");
document.write(ryoukin(3,7)+"円です。<br>");