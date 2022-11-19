import axios from 'axios';
import icon from '../../assets/img/notification-icon.svg';
import { BASE_URL } from '../../utils/request';
import './styles.css';

//props permite que componente react receba um parâmetro, no caso Id
type Props = {
  saleId: number;
}

//ao clicar envia notificação por sms
function handleClick(saleId: number) {
  axios(`${BASE_URL}/sales/${saleId}/notification`)
  .then(response => {
      console.log("SUCESSO")
  });
}

function NotificationButton({ saleId }: Props) {
  return (
    //className em react é o class do html
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton;
