import AdminPage from "./AdminPage";
import UserPage from "./UserPage";

const Login = (props: any) => {

	const doLogin = (loginValue: any) => {
		if (loginValue === 'admin') {
			return <AdminPage />;
		}

		return <UserPage />;
	}

	return <div>{doLogin(props.value)}</div>
}

export default Login;
