const AdminPage = (props: any) => {
	return (
		<div>
			Prisijungete kaip Admin
			<div>Prisijgimo login yra {props.loginName}</div>
			<div>Kiti propsai: {props.value1}, {props.value2}</div>
		</div>
	)
}

export default AdminPage;
