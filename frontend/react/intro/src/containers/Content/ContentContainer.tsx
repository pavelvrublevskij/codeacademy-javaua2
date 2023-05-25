import {Button, Form} from 'react-bootstrap';
import {useState} from "react";

const ContentContainer = () => {

	const [result, setResult] = useState("Test");

	const onSubmitEvent = (event: any) => {
		event.preventDefault();
		console.log(event.target[0].value);
		console.log(event.target[1].value);
		console.log(event.target[2].value);
		console.log(event.target[3].value);


		setResult(event.target[0].value);
	}

	return (
		<>
			<Form onSubmit={onSubmitEvent}>
				<Form.Group className='mb-3'>
					<Form.Label>Product name</Form.Label>
					<Form.Control placeholder='Write name'/>
				</Form.Group>

				<Form.Group className='mb-3' controlId='quantity'>
					<Form.Label>Product quantity</Form.Label>
					<Form.Control placeholder='Write quantity'/>
				</Form.Group>

				<Form.Group className='mb-3'>
					<Form.Label>Product price</Form.Label>
					<Form.Control placeholder='Write price'/>
				</Form.Group>

				<Form.Group className='mb-3'>
					<Form.Label>Product description</Form.Label>
					<Form.Control placeholder='Write description'/>
				</Form.Group>

				<Button variant='primary' type='submit'>
					Submit
				</Button>
			</Form>

			<div>{result}</div>
		</>
	);
}

export default ContentContainer;
