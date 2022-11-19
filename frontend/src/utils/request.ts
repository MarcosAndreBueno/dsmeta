//pega valor da variável ambiente, se não existir pega o local host
export const BASE_URL = import.meta.env.VITE_BACKEND_URL ?? "http://localhost:8080";