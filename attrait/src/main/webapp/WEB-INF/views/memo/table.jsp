<%@ page contentType="text/html; charset=UTF-8" %> 
<% request.setCharacterEncoding("utf-8"); %> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title></title> 
<style type="text/css"> 
*{ 
  font-family: gulim; 
  font-size: 20px; 
} 
</style> 
</head> 
<body> 
<TABLE align='center' border="1" cellpadding="20px" cellspacing="5px">
  <TR>
    <TH> </TH>
    <TH> </TH>
    <TH> </TH>
    <TH> </TH>
    <TH> </TH>
    <TH rowspan='5' bgcolor='#AAFFAA'> 6% </TH>
    <!-- tr안에있는th는옆으로 rowspan은 아래로 갯수만은 병합함-->    
  </TR>
  <TR>
    <TH> </TH>
    <TH> </TH>
    <TH> </TH>
    <TH> </TH>
    <TH rowspan='4' bgcolor='#AAFFAA'> 5% </TH>
  </TR>
  <TR>
    <TH> </TH>
    <TH> </TH>
    <TH rowspan='3' bgcolor='#AAFFAA'> 3% </TH>
    <TH> </TH>
   
  </TR>
  <TR>
    <TH> </TH>
    <TH rowspan='2' bgcolor='#AAFFAA'> 2% </TH>
    <TH rowspan='2' bgcolor='#AAFFAA'> 4% </TH>
  </TR>
  <TR>
    <TH rowspan='1' bgcolor='#AAFFAA'> 1% </TH>
  </TR>
  <tr>
  	<th></th>
  </tr>
 
</TABLE>
</body> 
</html> 