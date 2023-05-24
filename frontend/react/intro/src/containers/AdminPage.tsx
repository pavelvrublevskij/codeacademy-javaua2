const AdminPage = (props: any) => {
	return (
		<div>
			Prisijungete kaip Admin
			<div>Prisijgimo login yra {props.loginName}</div>
			<div>Kiti propsai: {props.item1}, {props.item2}</div>
		</div>
	)
}

export default AdminPage;
