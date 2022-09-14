const
  m = 4;
 
var
  Number: array[1..m] of integer;
  i, j: byte;
  bln: boolean;
  
begin
  writeln('Введите номера ', m, ' машин:');
  for i := 1 to m do
    read(Number[i]);
  writeln;
  for i:= 2 to m do begin
    j := 1;
    repeat
      bln:= (Number[i] = number[j]);
      inc(j)
    until bln or (j = i);
    if bln then write(' ', Number[i])
  end;
  if not bln then writeln('Одинаковых номеров нет');
  readln
end.