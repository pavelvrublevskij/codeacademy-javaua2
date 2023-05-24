import "./AdminPage.css";
import MyAlert from "../../component/MyALert";
import React from "react";

const AdminPage = (props: any) => {
	return (
		<>
			<MyAlert/>
			<div className={"AdminPage-backgroundColor"}>
				<div className={"d-flex justify-content-center"}>
					Prisijungete kaip Admin
					<div>Prisijgimo login yra {props.loginName}</div>
					<div>Kiti propsai: {props.item1}, {props.item2}</div>
				</div>
			</div>
		</>
	)
}

export default AdminPage;
