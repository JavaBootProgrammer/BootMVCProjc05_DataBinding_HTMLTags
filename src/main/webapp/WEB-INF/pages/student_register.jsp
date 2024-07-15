<%@ page isELIgnored="false"%>

<h1 style="color: red; text-align: center;">Student Registration
	Page</h1>

<form action="register" method="POST">

	<table align="center">

		<tr>
			<td>Student no:</td>
			<td><input type="text" name="sno"></td>
		</tr>

		<tr>
			<td>Student name:</td>
			<td><input type="text" name="sname"></td>
		</tr>

		<tr>
			<td>Student address:</td>
			<td><input type="text" name="saddress"></td>
		</tr>


		<tr>
			<td>Student average:</td>
			<td><input type="text" name="savg"></td>
		</tr>


		<tr>
			<td><input type="submit" name="Register"></td>
		</tr>



	</table>
	
	
	
</form>

