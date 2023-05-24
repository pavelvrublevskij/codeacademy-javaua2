import "./UserPage.css";

const UserPage = ({loginName}: any) => {
	return (
		<div className={"UserPage-backgroundColor"}>
			Prisijungete kaip User
			<div>Prisijungimo login yra {loginName}</div>
		</div>
	)
}

export default UserPage;
