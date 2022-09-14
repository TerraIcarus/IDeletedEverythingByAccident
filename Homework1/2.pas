Const Ldim=3;Ndim=2;
Var L:array[1..Ldim] of real;
    N,M:array[1..Ndim] of real; 
    i:byte;
    z,s:real;
Begin
    writeln('Введите ',Ldim,' элементов массива L');
    For i:=1 to Ldim do
     read(L[i]);
    writeln('Введите ',Ndim,' элементов массива N');
    For i:=1 to Ndim do
     read(N[i]);
    writeln('Введите ',Ndim,' элементов массива M');
    For i:=1 to Ndim do
     read(M[i]);
    For i:=1 to Ldim do
     s:=s+sqr(L[i]);
    For i:=1 to Ndim do
     z:=z+(n[i]+m[i]);
    z:=s/(l[1]*z);
    writeln('Z = ',z:0:2);
    readln;
End.